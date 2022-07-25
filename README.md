<h1 align="center">
  🎥 ImdbStickers 🎬
</h1>


<p align="center">
  <img src="https://user-images.githubusercontent.com/64162701/180638014-296095f3-a999-4d48-a6dc-0847bc419218.png">
</p>


<p align="center">
  <a href="https://gitmoji.dev">
    <img src="https://img.shields.io/badge/gitmoji-%20😜%20😍-FFDD67.svg" alt="Gitmoji">
  </a>
  <a href="https://github.com/LeonardoBringel/ImdbStickers/blob/main/LICENSE">
    <img src="https://img.shields.io/github/license/LeonardoBringel/ImdbStickers?color=blue" alt="License">
  </a>
</p>


## 📌 About

The challenge proposed in this bootcamp was to develop a project to increase engagement with IMDb top movies and series.
The solution presented by ImdbStickers is to generate stickers based on the user rating of movies and series, encouraging their collection and sharing.


## ✨ Main Features

* List top 250 movies from IMdb
* Search by name
* Display detailed information about a movie
* Generate stickers based on user rating of the movie


## 🚀 Technologies Used

* [Java](https://dev.java/): Programming language
* [Maven](https://maven.apache.org/): Build automation tool
* [Gson](https://mvnrepository.com/artifact/com.google.code.gson/gson): Library used to convert a JSON into a Java object
* [IMDb API](https://imdb-api.com/): API for interacting with IMDb


## 🎨 Preview

![imdbstickers-preview-01](https://user-images.githubusercontent.com/64162701/180670933-94f25dfb-6b71-457a-af54-be3549e21ca0.png)

![imdbstickers-preview-02](https://user-images.githubusercontent.com/64162701/180670936-14d91fe6-d2e1-417d-a12d-673f4e630dd3.png)

![imdbstickers-preview-03](https://user-images.githubusercontent.com/64162701/180671073-19ebc82a-57a2-4278-ad79-22e3dce2967e.png)


## 🚚 Getting Started

Clone this repository and add project dependencies.

```
git clone https://github.com/LeonardoBringel/ImdbStickers
mvn clean install
```

Create an account at [IMDb API](https://imdb-api.com/) and generate your key. Then create an api.properties in the project folder as follows.

```
topMoviesUrl = https://imdb-api.com/en/API/Top250Movies/YOUR_API_KEY
```


## 📄 License

This project is MIT licensed, as found in the [LICENSE](./LICENSE) file.
