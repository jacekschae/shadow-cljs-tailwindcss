# shadow-cljs + tailwindcss-jit

This is an example of how to setup shadow-cljs and  using [tailwindcss-jit](https://github.com/tailwindlabs/tailwindcss-jit)

## Development

```bash
git clone https://github.com/jacekschae/shadow-cljs-tailwindcss.git app
cd app
npm install
npm run postcss:build # only once after clone to init src/css/tailwind.css
npm run dev
```

This runs the `shadow-cljs` server process and `postcss`. It will observe `cljs-runtime/*.js` files in dev and will use `main.js` for creating a release build.

The first startup takes a bit of time since it has to download all the dependencies and do some prep work. Once this is running we can get started.

To run your app open [http://localhost:9630](http://localhost:9630) and do it with shadow-cljs ui

`shadow-cljs` is configured by the `shadow-cljs.edn` config.

`tailwindcss` is configured by the `tailwind.config.js` file. Postcss is configured in `postcss.config.js`. Also checkout `npm scripts` configured in `package.json`


## Live reload

Live reload is configured for `*.cljs` and `*.css` files. This is actually not true, it's using only output of shadow-cljs files `*.js` files to be exact, but you know, for the sake of clarity. More info in `tailwind.config.js`.

## REPL

During development you can start a REPL.

From the command line use `npx shadow-cljs cljs-repl app`.

```
shadow-cljs - config .../shadow-cljs.edn
shadow-cljs - connected to server
cljs.user=>
```

This can now be used to eval code in the browser (assuming you still have it open). Try `(js/alert "Hi.")` and take it from there. You might want to use `rlwrap npx shadow-cljs cljs-repl app` if you intend to type a lot here.

You can exit the REPL by either `CTRL+C` or typing `:repl/quit`.

## Release

To create a release artifact run `npm run release` which will create a a js and css assests.

```
npm run release
```
