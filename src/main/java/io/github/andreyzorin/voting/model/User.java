package io.github.andreyzorin.voting.model;


public class User extends AbstractNamedEntity {
    private String email;
    private String password;
    private Role role;
    protected boolean enabled = true;

    public User() {
    }

    public User(Integer id, String name, String email, String password, Role role) {
        super(id, name);
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public User(Integer id, String name, String email, String password, Role role, boolean enabled) {
        super(id, name);
        this.email = email;
        this.password = password;
        this.role = role;
        this.enabled = enabled;
    }

    public User(User u) {
        this(u.getId(), u.getName(), u.getEmail(), u.getPassword(), u.getRole(), u.isEnabled());
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", role=" + role +
                ", enabled=" + enabled +
                '}';
    }
}
