package ru.gb.hometask.task3;

public class StringService {
    public boolean isPalindrome(String s) {
        if (s == null) return false;
        String clean = s.replaceAll("[^a-zA-Zа-яА-Я0-9]", "").toLowerCase();
        int left = 0;
        int right = clean.length() - 1;
        while (left < right) {
            if (clean.charAt(left) != clean.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public int countVowels(String s) {
        if (s == null) return 0;
        String vowels = "aeiouаеёиоуыэюяAEIOUАЕЁИОУЫЭЮЯ";
        int count = 0;
        for (char c : s.toCharArray()) {
            if (vowels.indexOf(c) != -1) count++;
        }
        return count;
    }

    public int countConsonants(String s) {
        if (s == null) return 0;
        String vowels = "aeiouаеёиоуыэюяAEIOUАЕЁИОУЫЭЮЯ";
        int count = 0;
        for (char c : s.toCharArray()) {
            char lc = Character.toLowerCase(c);
            if (lc >= 'a' && lc <= 'z' || lc >= 'а' && lc <= 'я') {
                if (vowels.indexOf(lc) == -1) count++;
            }
        }
        return count;
    }

    public int countWordOccurrences(String text, String word) {
        if (text == null || word == null || word.isEmpty()) return 0;
        String lowerText = text.toLowerCase();
        String lowerWord = word.toLowerCase();
        int count = 0;
        int index = 0;
        while ((index = lowerText.indexOf(lowerWord, index)) != -1) {
            count++;
            index += word.length();
        }
        return count;
    }
}

