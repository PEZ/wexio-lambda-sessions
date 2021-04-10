(ns duplicates
  (:require [clojure.string :as string]))

;; https://edabit.com/challenge/WS6hR6b9EZzuDTD26
;; Given a common phrase, return False if any individual word in the phrase contains duplicate letters. Return True otherwise.
;; 
;; no_duplicate_letters ("Fortune favours the bold.") ➞ True
;; no_duplicate_letters ("You can lead a horse to water, but you can't make him drink.") ➞ True
;; no_duplicate_letters ("Look before you leap.") ➞ False
;; #Duplicate letters in "Look" and "before" .
;; no_duplicate_letters ("An apple a day keeps the doctor away.") ➞ False
;; #Duplicate letters in "apple", "keeps", "doctor", and "away" .

(def test-sentences
  ["Fortune favours the bold."
   "You can lead a horse to water, but you can't make him drink."
   "Look before you leap."
   "An apple a day keeps the doctor away."])
