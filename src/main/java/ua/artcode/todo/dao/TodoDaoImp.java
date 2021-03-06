package ua.artcode.todo.dao;

import ua.artcode.todo.model.Todo;

import java.util.*;

/**
 * Created by serhii on 22.10.17.
 */
public class TodoDaoImp implements TodoDao {

    private Map<Integer, Todo> map;

    public TodoDaoImp() {
        this.map = new HashMap<>();
    }

    @Override
    public Todo create(Todo todo) {
        // todo replace
        todo.setId(new Random().nextInt(5000));
        map.put(todo.getId(), todo);
        return todo;
    }

    @Override
    public List<Todo> all() {
        return new ArrayList<>(map.values());
    }

    @Override
    public Todo find(int id) {
        return map.get(id);
    }
}
