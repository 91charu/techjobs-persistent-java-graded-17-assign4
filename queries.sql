--Part 1
CREATE TABLE job (
    id INT PRIMARY KEY,
    employer VARCHAR(255),
    name VARCHAR(255),
    skills VARCHAR(255)
);
--Part 2
SELECT name
FROM employer
WHERE location = "St. Louis City";
--Part 3
DROP TABLE job;
--Part 4
--SELECT DISTINCT skill.name
--FROM skill
----LEFT JOIN job ON skill.id = skills
--INNER JOIN job ON skill.id = job.id
--WHERE job.id IS NOT NULL
--ORDER BY skill.name ASC;

select * from skill
left join job_skills on job_skills.skills_id = skill.id
where job_skills.jobs_id is not null
order by name asc;