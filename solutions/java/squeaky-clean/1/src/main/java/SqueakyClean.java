class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder cleaned = new StringBuilder();
        boolean kebab = false;

        for (int i = 0; i < identifier.length(); i++) {
            char ch = identifier.charAt(i);

            // 1. 공백을 밑줄(_)로 변환
            if (Character.isWhitespace(ch)) {
                cleaned.append('_');
                // 2. 제어 문자(\0 ~ \u001F)를 "CTRL" 문자열로 변환
            } else if (Character.isISOControl(ch)) {
                cleaned.append("CTRL");
                // 3. 케밥 표기법(-)을 카멜 표기법으로 변환 (다음 문자 대문자화)
            } else if (ch == '-') {
                kebab = true;
                // 4. 그리스어 소문자(\u03b1 ~ \u03c9) 제외
            } else if (ch >= '\u03b1' && ch <= '\u03c9') {
                continue;
                // 5. leetspeak 변환 (4->a, 3->e, 0->o, 1->i, 7->t)
            } else {
                if (kebab) {
                    ch = Character.toUpperCase(ch);
                    kebab = false;
                }

                switch (ch) {
                    case '4' -> cleaned.append('a');
                    case '3' -> cleaned.append('e');
                    case '0' -> cleaned.append('o');
                    case '1' -> cleaned.append('i');
                    case '7' -> cleaned.append('t');
                    default -> cleaned.append(ch);
                }
            }
        }
        return cleaned.toString();
    }
}
