## Authentication & Security

This project uses JWT-based authentication with Spring Security.

### Flow
1. Client calls `/auth/login`
2. Server issues JWT with role claim
3. JWT is validated on every request via filter
4. Role-based access enforced using method security

### Roles
- ROLE_ADMIN
- ROLE_MANAGER
- ROLE_USER
