 /**
 * 
 */
package in.techshine.beans;

import java.util.Set;

import javax.persistence.*;

/**
 * @author anup
 *
 */
@Entity
@Table(name = "role")
public class Role {
    private Long id;
    private String name;
    private Set<User> users;

    public Role(){
    	
    }
    public Role(Long id, String name, Set<User> users) {
		super();
		this.id = id;
		this.name = name;
		this.users = users;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToMany(mappedBy = "roles")
    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}