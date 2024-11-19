 CREATE TABLE question (
       id SERIAL PRIMARY KEY,
       question_text TEXT NOT NULL,
       level VARCHAR(10) NOT NULL,
       options JSONB NOT NULL,
       correct_option TEXT NOT NULL
   );

CREATE TABLE test_result (
    id SERIAL PRIMARY KEY,
    user_id BIGINT NOT NULL,
    score INT NOT NULL,
    level VARCHAR(255),
    date_taken TIMESTAMP
);

CREATE TABLE user_info (
    id SERIAL PRIMARY KEY,
    username VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    email VARCHAR(255),
    created_at TIMESTAMP
);
