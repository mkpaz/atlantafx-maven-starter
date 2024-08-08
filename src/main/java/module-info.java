module starter {

    requires javafx.controls;

    requires atlantafx.base;
    requires org.kordamp.ikonli.core;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.ikonli.materialdesign2;

    exports starter;

    // resources
    opens assets;
    opens assets.icons;
}