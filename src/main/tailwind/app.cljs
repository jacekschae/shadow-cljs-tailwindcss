(ns tailwind.app
  (:require [reagent.dom :as dom]
            [tailwind.views :as views]
            [tailwind.db :as db]))

(defn app
  []
  (if (:auth? @db/state)
    [views/authenticated]
    [views/public]))

;; start is called by init and after code reloading finishes
(defn ^:dev/after-load start []
  (dom/render [app]
    (.getElementById js/document "app")))

(defn init []
  ;; init is called ONCE when the page loads
  ;; this is called in the index.html and must be exported
  ;; so it is available even in :advanced release builds
  (js/console.log "init")
  (start))

;; this is called before any code is reloaded
(defn ^:dev/before-load stop []
  (js/console.log "stop"))
