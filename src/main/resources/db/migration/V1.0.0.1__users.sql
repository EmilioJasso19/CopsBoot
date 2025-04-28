CREATE TABLE copsboot_user (
    id BINARY(16) PRIMARY KEY,
    auth_server_id BINARY(16),
    email VARCHAR(255),
    mobile_token VARCHAR(255)
);