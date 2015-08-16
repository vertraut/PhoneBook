package main.menu.pages;

public enum MenuPages {

    MAIN("-== Телефонная книга ==-\n" +
            "Выберете действие:\n" +
            "1. Просмотр контактов\n" +
            "2. Добавление нового контакта");

    private String content;

    MenuPages(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
