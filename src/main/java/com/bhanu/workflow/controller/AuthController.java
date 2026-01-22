@RestController
@RequestMapping("/auth")
public class AuthController {

    private final JwtUtil jwtUtil;

    public AuthController(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("/login")
    public Map<String, String> login(
            @RequestParam String username,
            @RequestParam String role
    ) {
        String token = jwtUtil.generateToken(username, role);
        return Map.of("token", token);
    }
}
