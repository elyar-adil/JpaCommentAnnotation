# JpaCommentAnnotation
Comment annotation support for JPA DDL generation.

To setup the integrator, add this config class:
```java
@Component
public class HibernateConfig implements HibernatePropertiesCustomizer {
    @Override
    public void customize(Map<String, Object> hibernateProperties) {
        hibernateProperties.put("hibernate.use_sql_comments", true);
        hibernateProperties.put("hibernate.integrator_provider",
                (IntegratorProvider) () -> Collections.singletonList(CommentIntegrator.INSTANCE));
    }
}
```
Code sample:
```java
@Data
@Entity
@Comment("Demo table comment")
@Table(name = "demo_table")
public class DemoTable {

    @Id
    @GeneratedValue
    @Comment("ID comment")
    @Column(name = "id")
    private Integer id;

    @Comment("Value comment")
    @Column(name = "value")
    private String value;

}
```
