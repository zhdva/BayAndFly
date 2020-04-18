package org.buyandfly.model;

import java.util.List;

public class User {

    private long id;
    private String login;
    private String password;
    private String first_name;
    private String last_name;
    private int score;
    private List<Order> orders;

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public int getScore() {
        return score;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setLogin(final String login) {
        this.login = login;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public void setFirst_name(final String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(final String last_name) {
        this.last_name = last_name;
    }

    public void setScore(final int score) {
        this.score = score;
    }

    public void setOrders(final List<Order> orders) {
        this.orders = orders;
    }
}
