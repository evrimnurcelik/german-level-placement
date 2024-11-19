package com.german.placement_test.controller;

import com.german.placement_test.model.Question;
import com.german.placement_test.model.Result;
import com.german.placement_test.service.PlacementTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/api/test")
public class TestController {

    private final PlacementTestService testService;

    @Autowired
    public TestController(PlacementTestService testService) {
        this.testService = testService;
    }

    @GetMapping("/questions/{level}")
    public List<Question> getQuestions(@PathVariable String level) {
        return testService.getQuestionsByLevel(level);
    }

    @PostMapping("/submit-answers")
    public Result submitAnswers(@RequestBody Result result) {
        return testService.saveResult(result);
    }
}