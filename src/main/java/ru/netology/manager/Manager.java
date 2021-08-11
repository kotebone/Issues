package ru.netology.manager;

import ru.netology.domain.Issue;
import ru.netology.repisitory.Repository;

public class Manager {
    Repository repository = new Repository();

    public void add (Issue issue){
        repository.save(issue);
    }

    public void getOpened(Issue issue) {
        return issues;
    }

    public void getClosed(Issue issue) {
        return issues;
    }



    public void shoudClose(Issue issue) {

    }

    public void shoudOpen(Issue issue) {

    }
}