function checkPrice(event) {
  event.preventDefault();

  const weight = parseInt(document.getElementById("weight").value);
  const service = document.getElementById("service").value;
  const type = document.getElementById("type").value;
  const discount = document.getElementById("discount").value;

  const servicePrices = {
    wash_dry: 1000,
    wash_iron: 1200,
    iron_only: 900,
  };

  let pricePerKg = servicePrices[service];

  let expressFee = 0;
  if (type === "express") {
    expressFee = 200;
  }

  let totalPrice = (pricePerKg + expressFee) * weight;

  if (discount === "member") {
    totalPrice = totalPrice * 0.9;
  }

  document.getElementById("result").innerHTML = `Total Price: Rp ${Math.round(
    totalPrice
  )}`;
}
