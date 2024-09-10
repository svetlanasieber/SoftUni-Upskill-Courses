ALTER TABLE products
ADD CONSTRAINT fk_category_id
FOREIGN KEY (category_id) REFERENCES categories(id);
