const express = require("express");
const mongoose = require("mongoose");

const animal = mongoose.model(
  "animal",
  new mongoose.Schema({
    kind: String,
    state: String,
  })
);

const app = express();

mongoose.connect(
  "mongodb://U22208295:JUANCIn080604@mongo_container:27017/expressjsapp?authSource=admin"
);

app.get("/", async (request, responsive) => {
  console.log("Http - GET Request - Hellow World!");
  const animals = await animal.find();
  return responsive.send(animals);
});
app.get("/create", async (request, responsive) => {
  console.log("Http - POST Request");
  await animal.create({ kind: "Dog", state: "Alive" });
  return responsive.send("Ok!");
});

app.listen(3000, () => console.log("http://localhost:3000"));