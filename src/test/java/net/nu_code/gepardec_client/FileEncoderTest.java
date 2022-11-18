package net.nu_code.gepardec_client;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
class FileEncoderTest {

    @Autowired
    private FileEncoder fileEncoder;

    @MockBean
    private AppRunner app_intoVoid;

    @Value("${challenge.cv_path}")
    private String cvPath;

    @Test
    void encodeFileToBase64() {
        String expected = "dGVzdCBjdiBmaWxl";

        String result = fileEncoder.encodeFileToBase64(cvPath);

        assertEquals(expected, result);
    }

    @Test
    void encodeFileToBase64_ShouldThrowAnException() {
        String fileLocation = "src/test/resources/not_existing.txt";
        assertThrows(IllegalStateException.class, () -> fileEncoder.encodeFileToBase64(fileLocation));
    }
}
