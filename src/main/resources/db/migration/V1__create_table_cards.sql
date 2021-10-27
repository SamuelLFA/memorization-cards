CREATE TABLE cards(
    id SERIAL NOT NULL,
    original_text VARCHAR(100) NOT NULL,
    translated_text VARCHAR(100) NOT NULL,
    PRIMARY KEY (id)
);
