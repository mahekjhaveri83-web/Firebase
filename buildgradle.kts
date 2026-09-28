id("com.google.gms.google-services")
In void main() after import we will write
void main() async {
WidgetsFlutterBinding.ensureInitialized();
await Firebase.initializeApp(
options: DefaultFirebaseOptions.currentPlatform,
);const MyApp());
}
