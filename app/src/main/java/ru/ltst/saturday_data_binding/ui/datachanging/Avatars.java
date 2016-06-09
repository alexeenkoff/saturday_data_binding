package ru.ltst.saturday_data_binding.ui.datachanging;

public enum Avatars {

    A("http://icons.iconarchive.com/icons/hopstarter/bioman/512/Bioman-Avatar-3-Blue-icon.png"),
    B("http://icons.iconarchive.com/icons/hopstarter/bioman/512/Bioman-Avatar-4-Yellow-icon.png"),
    C("http://icons.iconarchive.com/icons/hopstarter/bioman/512/Bioman-Avatar-1-Red-icon.png"),
    D("http://icons.iconarchive.com/icons/hopstarter/bioman/512/Bioman-Avatar-2-Green-icon.png"),
    E("http://icons.iconarchive.com/icons/hopstarter/bioman/512/Bioman-Avatar-6-Peebo-icon.png");
    private String avatarUrl;

    Avatars(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }
}
