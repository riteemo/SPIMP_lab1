(def users
  [{:name "Anna"  :age 20 :city "Moscow"}
   {:name "Boris" :age 21 :city "Kazan"}
   {:name "Vera"  :age 20 :city "Moscow"}
   {:name "Gleb"  :age 22 :city "Sochi"}
   {:name "Dasha" :age 21 :city "Kazan"}
   {:name "Egor"  :age 20 :city "Sochi"}])

(defn group-users-by-key [users key]
  (group-by key users))

(println "Group by age:")
(println (group-users-by-key users :age))

(println "\nGroup by city:")
(println (group-users-by-key users :city))