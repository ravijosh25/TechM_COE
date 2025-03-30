import 'package:flutter/material.dart';

class HealthTipsScreen extends StatelessWidget {
   HealthTipsScreen({super.key});

  final List<Map<String, dynamic>> healthTips = [
    {
      "title": "Stay Hydrated",
      "description": "Drink at least 8 glasses of water daily to keep your body hydrated and maintain energy levels.",
      "icon": Icons.local_drink,
      "color": Colors.blue
    },
    {
      "title": "Exercise Regularly",
      "description": "Engage in at least 30 minutes of physical activity daily to stay fit and healthy.",
      "icon": Icons.fitness_center,
      "color": Colors.green
    },
    {
      "title": "Eat Nutritious Food",
      "description": "Include more vegetables, fruits, and proteins in your diet while avoiding processed food.",
      "icon": Icons.restaurant,
      "color": Colors.orange
    },
    {
      "title": "Get Enough Sleep",
      "description": "Ensure 7-9 hours of quality sleep per night for better mental and physical health.",
      "icon": Icons.bedtime,
      "color": Colors.purple
    },
    {
      "title": "Manage Stress",
      "description": "Practice meditation, deep breathing, or yoga to reduce stress and anxiety.",
      "icon": Icons.self_improvement,
      "color": Colors.red
    },
    {
      "title": "Limit Screen Time",
      "description": "Reduce excessive screen time to avoid eye strain and maintain better sleep quality.",
      "icon": Icons.screen_lock_portrait,
      "color": Colors.teal
    }
  ];

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text("Health Tips")),
      body: Padding(
        padding: const EdgeInsets.all(16.0),
        child: ListView.builder(
          itemCount: healthTips.length,
          itemBuilder: (context, index) {
            final tip = healthTips[index];
            return Card(
              color: tip["color"].withOpacity(0.2),
              shape: RoundedRectangleBorder(borderRadius: BorderRadius.circular(15)),
              elevation: 5,
              margin: const EdgeInsets.symmetric(vertical: 10),
              child: ListTile(
                leading: CircleAvatar(
                  backgroundColor: tip["color"],
                  child: Icon(tip["icon"], color: Colors.white),
                ),
                title: Text(
                  tip["title"],
                  style: const TextStyle(fontSize: 18, fontWeight: FontWeight.bold),
                ),
                subtitle: Text(tip["description"]),
              ),
            );
          },
        ),
      ),
    );
  }
}
