package com.german.placement_test.service;

import com.german.placement_test.model.Question;
import com.german.placement_test.model.Result;
import com.german.placement_test.repo.QuestionRepository;
import com.german.placement_test.repo.ResultRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlacementTestService {
  private final QuestionRepository questionRepository;
  private final ResultRepository resultRepository;

  @Autowired
  public PlacementTestService(
      QuestionRepository questionRepository, ResultRepository resultRepository) {
    this.questionRepository = questionRepository;
    this.resultRepository = resultRepository;
  }

  public List<Question> getQuestionsByLevel(String level) {
    return questionRepository.findByLevel(level);
  }

  public Result saveResult(Result result) {
    return resultRepository.save(result);
  }
}
