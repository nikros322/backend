INSERT INTO cabinets (id, places, comp_places)
VALUES
    ('2-1', 30, 10),
    ('2-2', 10, 0),
    ('2-3', 30, 10),
    ('2-4', 30, 12),
    ('2-5', 30, 9),
    ('3-0', 30, 10),
    ('3-1', 25, 12),
    ('3-2', 70, 0),
    ('3-3', 30, 12),
    ('3-4', 30, 0)
ON CONFLICT (id) DO NOTHING;

INSERT INTO reserves (student_id, reserve_date, cabinet_ids)
VALUES
    ('i00s0000', '2025-12-26', '["3-1","3-2","3-3","3-4"]'),
    ('i00s0001', '2025-12-17', '["3-2","3-4"]'),
    ('i00s0001', '2025-12-19', '["3-2","2-4"]');
