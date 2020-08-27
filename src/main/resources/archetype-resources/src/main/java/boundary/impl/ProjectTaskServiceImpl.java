package ${package}.boundary.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import ${package}.boundary.ProjectService;
import ${package}.entity.Project;

@Stateless
public class ProjectTaskServiceImpl extends AbstractBeanImpl<Project, Long> implements ProjectService {

  @PersistenceContext(unitName = "pu")
  private EntityManager em;

  public ProjectTaskServiceImpl() {
    super(Project.class);
  }

  @Override
  protected EntityManager getEntityManager() {
    return em;
  }
}