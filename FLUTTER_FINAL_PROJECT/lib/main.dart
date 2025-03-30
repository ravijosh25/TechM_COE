// import 'package:flutter/material.dart';
// import 'screens/home_screen.dart';
// import 'screens/bmi_calculator_screen.dart';
// import 'screens/health_tips_screen.dart';
// import 'screens/activity_tracker_screen.dart';
// import 'screens/profile_screen.dart';


// void main() {
//   runApp(const HealthBuddyApp());
// }

// class HealthBuddyApp extends StatelessWidget {
//   const HealthBuddyApp({super.key});

//   @override
//   Widget build(BuildContext context) {
//     return MaterialApp(
//       debugShowCheckedModeBanner: false,
//       title: 'Health Buddy',
//       theme: ThemeData(
//         primarySwatch: Colors.blue,
//       ),
//       home:  HomeScreen(), // Set HomeScreen as the initial screen
//       routes: {
//         '/bmiCalculator': (context) =>  BMICalculatorScreen(),
//         '/healthTips': (context) =>  HealthTipsScreen(),
//         '/activityTracker': (context) =>  ActivityTrackerScreen(),
//         '/profile': (context) =>  ProfileScreen(),
//       },
//     );
//   }
// }

import 'package:flutter/material.dart';
import 'package:easy_localization/easy_localization.dart';
import 'screens/home_screen.dart';
import 'screens/bmi_calculator_screen.dart';
import 'screens/health_tips_screen.dart';
import 'screens/activity_tracker_screen.dart';
import 'screens/profile_screen.dart';

void main() async {
  WidgetsFlutterBinding.ensureInitialized();
  await EasyLocalization.ensureInitialized();
  runApp(
    EasyLocalization(
      supportedLocales: [Locale('en', ''), Locale('ta', '')],
      path: 'assets/lang', // JSON path
      fallbackLocale: Locale('en', ''),
      child: const HealthBuddyApp(),
    ),
  );
}

class HealthBuddyApp extends StatelessWidget {
  const HealthBuddyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      title: 'Health Buddy',
      theme: ThemeData(primarySwatch: Colors.blue),
      home: HomeScreen(),
      routes: {
        '/bmiCalculator': (context) => BMICalculatorScreen(),
        '/healthTips': (context) => HealthTipsScreen(),
        '/activityTracker': (context) => ActivityTrackerScreen(),
        '/profile': (context) => ProfileScreen(),
      },
      localizationsDelegates: context.localizationDelegates,
      supportedLocales: context.supportedLocales,
      locale: context.locale,
    );
  }
}
