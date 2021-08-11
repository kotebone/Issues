package ru.netology.repisitory;

import ru.netology.domain.Issue;
import ru.netology.expection.NotFoundException;

import java.util.ArrayList;
import java.util.Collection;

public class Repository {
    private Collection<Issue> issues = new ArrayList<>();

    public void save(Issue issue) {
        issues.add(issue);
    }

    public Collection<Issue> findAll() {
        return issues;
    }

    public Issue findById(int id) {
        for (Issue issue : issues) {
            if (issue.getId() == id);
            return issue;
        }
        return null;
    }

    public Issue getById(int id) {
        for (Issue issue : issues) {
            if (issue.getId() == id) {
                return issue;
            }
        }
        return null;
    }

    public void removeById(int id) {
        if (findById(id) == null) {
            throw new NotFoundException(String.format("Issue with id %s not found", id));
        }
        issues.removeIf(el -> el.getId() == id);
    }
}