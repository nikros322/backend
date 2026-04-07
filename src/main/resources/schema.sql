CREATE TABLE IF NOT EXISTS cabinets (
    id VARCHAR(50) PRIMARY KEY,
    places INTEGER NOT NULL,
    comp_places INTEGER NOT NULL
);

CREATE TABLE IF NOT EXISTS reserves (
    id BIGSERIAL PRIMARY KEY,
    student_id VARCHAR(50) NOT NULL,
    reserve_date VARCHAR(30) NOT NULL,
    cabinet_ids TEXT NOT NULL
);
