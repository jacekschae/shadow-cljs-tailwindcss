# shadow-cljs + tailwindcss

This is an example of how to setup shadow-cljs and [tailwindcss](https://github.com/tailwindlabs/tailwindcss)

## Setup

```bash
git clone https://github.com/jacekschae/shadow-cljs-tailwindcss.git app
cd app
npm install
npm run dev
```

This runs the `shadow-cljs` server, builds tailwind-css and runs `postcss`. It will observe `cljs-runtime/*.js` files in dev and will use `main.js` for creating a release build.

The first startup takes a bit of time since it has to download all the dependencies and do some prep work. Once this is running you can open browser [http://localhost:8020](http://localhost:8020) and get started.

## Config 

`shadow-cljs` is configured by the `shadow-cljs.edn` file and the UI is available at [http://localhost:9630](http://localhost:9630).

`tailwindcss` is configured by the `tailwind.config.js` file.

`postcss` is configured in `postcss.config.js` file.

Also check `npm scripts` configured in `package.json`, to understand how everything is stitched together for `dev` and `release` commands.

## REPL

During development you can start a REPL.

From the command line use `npx shadow-cljs cljs-repl app`.

```
shadow-cljs - config .../shadow-cljs.edn
shadow-cljs - connected to server
cljs.user=>
```

This can now be used to eval code in the browser (assuming you still have it open). Try `(js/alert "Hi.")` and take it from there. You might want to use `rlwrap npx shadow-cljs cljs-repl app` if you intend to type a lot here.

You can exit the REPL by either `CTRL+C` or 
typing `:repl/quit`.

PS. Most probably you want to connect to the REPL from your editor, and not type in the terminal.

## Release

To create a release artifact run `npm run release` which will create a js and css assests.

```
npm run release
```
