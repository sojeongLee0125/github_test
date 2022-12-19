package github_test.todo.service;

import github_test.todo.controller.TodoController;
import github_test.todo.domain.Board;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TodoServiceTest {

    @Autowired
    private TodoService todoService;
    //ddd
    // 주석 추가

    @Test
    void crollingTest() throws Exception {
        List<Board> crolling = todoService.crolling();

        for (Board board : crolling) {
            System.out.println("board = " + board);
        }
    }

}