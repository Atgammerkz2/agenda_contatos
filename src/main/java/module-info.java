module org.agenda_contatos {
    requires javafx.controls;
    requires javafx.fxml;
    requires static lombok;
    requires jakarta.persistence;
    requires org.hibernate.orm.core;
    requires java.naming;
    requires java.sql;
    requires org.postgresql.jdbc;

    exports org.agenda_contatos.controller;
    opens org.agenda_contatos.model.entities to org.hibernate.orm.core;
    opens org.agenda_contatos to javafx.fxml;
    exports org.agenda_contatos;
}