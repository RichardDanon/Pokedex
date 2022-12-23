INSERT INTO types (name, color, icon) VALUES
    ('Fire', '#F08030', ':fire:'),
    ('Water', '#6890F0', ':droplet:'),
    ('Grass', '#78C850', ':shamrock: '),
    ('Electric', '#F8D030', '⚡️'),
    ('Normal', '#A8A878', ''),
    ('Ice', '#98D8D8', ''),
    ('Fighting', '#C03028', ''),
    ('Poison', '#A040A0', ''),
    ('Ground', '#E0C068', ''),
    ('Flying', '#A890F0', ''),
    ('Psychic', '#F85888', ''),
    ('Bug', '#A8B820', ''),
    ('Rock', '#B8A038', ''),
    ('Ghost', '#705898', ''),
    ('Dark', '#705848', ''),
    ('Dragon', '#7038F8', ''),
    ('Steel', '#B8B8D0', ''),
    ('Fairy', '#F0B6BC', '')

;

INSERT INTO regions (name) VALUES
  ('Kanto'),
  ('Johto'),
  ('Hoenn'),
  ('Sinnoh'),
  ('Unova'),
  ('Kalos'),
  ('Alola'),
  ('Galar')
;

INSERT INTO pokemon (name, primary_type_id, region_id) VALUES
    ('Pikachu', 4, 1)
;