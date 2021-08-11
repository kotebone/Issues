package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Issue;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ManagerTest {
    Manager manager = new Manager();
    private Issue issue1 = new Issue(1, "Issue1", "I'm", true);
    private Issue issue2 = new Issue(2, "Issue2", "Сolleague", true);
    private Issue issue3 = new Issue(3, "Issue3", "Сolleague2", false);
    private Issue issue4 = new Issue(4, "Issue4", "Сolleague3", true);
    private Issue issue5 = new Issue(5, "Issue5", "Сolleague4", false);
    private Issue issue6 = new Issue(6, "Issue6", "I'm", false);


    @Test
    void shouldAdd (){
        manager.add(issue1);
    }

}