   CREATE TABLE questions (
       id SERIAL PRIMARY KEY,
       question_text TEXT,
       level VARCHAR(255),
       options TEXT,
       correct_option TEXT
   );

   CREATE TABLE test_results (
    id SERIAL PRIMARY KEY,
    user_id BIGINT NOT NULL,
    score INT NOT NULL,
    level VARCHAR(255),
    date_taken TIMESTAMP
);

CREATE TABLE user(
    id SERIAL PRIMARY KEY,
    username VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    email VARCHAR(255),
    created_at TIMESTAMP
);
