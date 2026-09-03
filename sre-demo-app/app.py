from flask import Flask, jsonify
import logging

app = Flask(__name__)

logging.basicConfig(
    level=logging.INFO,
    format="%(asctime)s %(levelname)s %(message)s"
)

orders = [
    {
        "id": 101,
        "customer": "Alice",
        "amount": 49.99
    },
    {
        "id": 102,
        "customer": "Bob",
        "amount": 29.99
    }
]


@app.route("/health")
def health():
    return jsonify({"status": "ok"})


@app.route("/api/orders")
def get_orders():
    logging.info("Fetching orders")

    result = []

    for order in orders:
        logging.info("Processing order %s", order["id"])

        # INTENTIONAL BUG:
        # The data contains "customer", but the code expects "customer_name".
        customer_name = order["customer_name"]

        result.append({
            "id": order["id"],
            "customer": customer_name,
            "amount": order["amount"]
        })

    return jsonify(result)


if __name__ == "__main__":
    logging.info("Starting SRE demo application")
    app.run(host="0.0.0.0", port=8080)