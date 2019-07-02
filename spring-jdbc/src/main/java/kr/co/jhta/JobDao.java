package kr.co.jhta;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class JobDao {

	private JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public void insertJob(Job job) {
		String sql = "insert into jobs(job_id, job_title, min_salary, max_salary)"
					+	"values(?,?,?,?)";
		
		template.update(sql, job.getId(), job.getTitle(), job.getMinSalary(), job.getMaxSalary());
	}
	
	public void deleteJob(String jobid) {
		String sql = "delete form jobs where job_id = ?";
		// Object ... (... 가변길이매개변수 더 적을수있다.)
		template.update(sql, jobid);
	}
	
	public void updateJob(Job job) {
		String sql = "update jobs "
						+ "set " 
						+ " job_title = ? " 
						+ " min_salary = ? "
						+ "max_salary = ? " 
						+ "where" 
						+ " job_id = ?";
		template.update(sql, job.getTitle(), job.getMinSalary(), job.getMaxSalary(), job.getId());
	}
	
	public Job getJobyId(String jobId) {
		String sql = "select * from jobs where job_id = ? ";
		return template.queryForObject(sql, new RowMapper<Job>() {
			public Job mapRow(ResultSet rs, int rowNum) throws SQLException {
				Job job = new Job();
				job.setId(rs.getString("job_id"));
				job.setTitle(rs.getString("job_title"));
				job.setMinSalary(rs.getInt("min_salary"));
				job.setMaxSalary(rs.getInt("max_salary"));
				
				return job;
			}
		}, jobId);
	}
}



