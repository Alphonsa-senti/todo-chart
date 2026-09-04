from flask import Flask, jsonify
import logging
import time
import os

app = Flask(__name__)

logging.basicConfig(
    level=logging.INFO,
    format="%(asctime)s %(levelname)s %(message)s"
)

START_TIME = time.time()

# Crash after 60 seconds
CRASH_AFTER_SECONDS = 60


@app.route("/health")
def health():
    return jsonify({"status": "ok"})


@app.route("/")
def home():
    return jsonify({
        "service": "sre-demo-app",
        "status": "running"
    })


def check_for_production_issue():
    uptime = time.time() - START_TIME

    if uptime >= CRASH_AFTER_SECONDS:
        logging.error(
            "CRITICAL: Database connection initialization failed"
        )

        logging.error(
            "CRITICAL: Unable to initialize database configuration"
        )

        # INTENTIONAL BUG
        database_config = None

        # This raises:
        # TypeError: 'NoneType' object is not subscriptable
        host = database_config["host"]

        logging.info("Database host: %s", host)


if __name__ == "__main__":
    logging.info("Starting SRE demo application")
    logging.info(
        "Application will crash after %s seconds",
        CRASH_AFTER_SECONDS
    )

    # Check every 5 seconds.
    while True:
        uptime = time.time() - START_TIME

        if uptime >= CRASH_AFTER_SECONDS:
            logging.error(
                "Production failure detected after %.1f seconds",
                uptime
            )

            check_for_production_issue()

            # Should never reach here.
            os._exit(1)

        time.sleep(5)