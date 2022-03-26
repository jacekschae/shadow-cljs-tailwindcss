# shadow-cljs + tailwindcss-css

This is an example of how to setup shadow-cljs and  using [tailwindcss](https://github.com/tailwindlabs/tailwindcss)

## Development

```bash
git clone https://github.com/jacekschae/shadow-cljs-tailwindcss.git app
cd app
npm install
npm run dev
```

This runs the `shadow-cljs` server, builds tailinw css and runs and `postcss`. It will observe `cljs-runtime/*.js` files in dev and will use `main.js` for creating a release build.

The first startup takes a bit of time since it has to download all the dependencies and do some prep work. Once this is running you can open browser [http://localhost:8020](http://localhost:8020) and get started.

## Config 

`shadow-cljs` is configured by the `shadow-cljs.edn` config and you can open shadow-cljs ui [http://localhost:9630](http://localhost:9630).

`tailwindcss` is configured by the `tailwind.config.js` file.

`postcss` is configured in `postcss.config.js`.

Also checkout `npm scripts` configured in `package.json`

## Live reload

Live reload is configured for `*.cljs` and `*.css` files. This is actually not true, it's using shadow-cljs runtime files in dev, which are `*.js` files. More info in `tailwind.config.js`.

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

PS. Most probably you want to connect to the REPL from your editor, and not evalute in the terminal.

## Release

To create a release artifact run `npm run release` which will create a js and css assests.

```
npm run release
```
