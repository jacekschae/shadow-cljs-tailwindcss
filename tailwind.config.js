const defaultTheme = require('tailwindcss/defaultTheme')

module.exports = {
  purge: {
    content: ["./src/main/**/*.cljs"]
  },
  darkMode: false, // or 'media' or 'class'
  theme: {
    extend: {
      fontFamily: {
        sans: ["Inter var", ...defaultTheme.fontFamily.sans],
      },
    },
  },
  variants: {},
  plugins: [
    require('@tailwindcss/forms'),
  ],
}