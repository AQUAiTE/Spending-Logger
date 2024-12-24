INSERT INTO users (id, email, username, password_hash, creation_date) VALUES
(gen_random_uuid(), 'user1@example.com', 'user1', encode(digest('password1', 'sha256'), 'hex'), CURRENT_TIMESTAMP),
(gen_random_uuid(), 'user2@example.com', 'user2', encode(digest('password2', 'sha256'), 'hex'), CURRENT_TIMESTAMP),
(gen_random_uuid(), 'user3@example.com', 'user3', encode(digest('password3', 'sha256'), 'hex'), CURRENT_TIMESTAMP);