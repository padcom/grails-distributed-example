import com.aplaline.example.person.Person
import com.aplaline.example.person.client.impl.JerseyPersonClient

class HomeController {
	def index = {
		def person = new JerseyPersonClient("http://localhost:8080/services-person/api").getPerson()
		[ message: "Hello, world!" ]
	}
}
