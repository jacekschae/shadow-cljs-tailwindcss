# shadow-cljs + tailwindcss-jit

This is a example of how to setup shadow-cljs and tailwindcss

## Development

```bash
git clone https://github.com/jacekschae/shadow-cljs-tailwindcss.git app
cd app
npm install
npx shadow-cljs server
npm run postcss:watch # in another terminal window
```

This runs the `shadow-cljs` server process and then by running `npm run postcss:watch` it will observe `*.cljs` files and create classes for your css on the fly, using [tailwindcss-jit](https://github.com/tailwindlabs/tailwindcss-jit).

The first startup takes a bit of time since it has to download all the dependencies and do some prep work. Once this is running we can get started.

To run your app you can either use the following bash command or open [http://localhost:9630](http://localhost:9630) and do it with shadow-cljs ui

```bash
npx shadow-cljs watch app
```

This will begin the compilation of the configured `:app` build and re-compile whenever you change a file.

When you see a "Build completed." message your build is ready to be used.

```txt
[:app] Build completed. (23 files, 4 compiled, 0 warnings, 7.41s)
```

You can now then open [http://localhost:8020](http://localhost:8020).

`shadow-cljs` is configured by the `shadow-cljs.edn` config. It looks like this:

`tailwindcss` is configured by the `tailwind.config.js` file. `npm scripts` are configured in `package.json`


## Live reload

To see the live reload in action you can edit the `src/start/browser.cljs`. Some output will be printed in the browser console.

## REPL

During development it the REPL is very useful.

From the command line use `npx shadow-cljs cljs-repl app`.

```
shadow-cljs - config .../shadow-cljs.edn
shadow-cljs - connected to server
cljs.user=>
```

This can now be used to eval code in the browser (assuming you still have it open). Try `(js/alert "Hi.")` and take it from there. You might want to use `rlwrap npx shadow-cljs cljs-repl app` if you intend to type a lot here.

You can exit the REPL by either `CTRL+C` or typing `:repl/quit`.

## Release

To create a release artifact run `npm run release` which will createa a css and js assests.

```
npm run release
```
