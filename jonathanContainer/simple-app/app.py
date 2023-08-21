from flask import Flask, render_template, request

app = Flask(__name__)

@app.route("/", methods=["GET", "POST"])
def coffee():
    return render_template("welcome.html")

@app.route("/customcoffee", methods=["GET", "POST"])
def customcoffee():
    if request.method == "POST":
        name = request.form.get("clientname")
        order = request.form.get("ordertype")
        milk = request.form.get("milktype")

        print(name, order, milk)

    return render_template("customcoffee.html")


if __name__ == "__main__":
    app.run(host="0.0.0.0", port="8001", debug=True)
