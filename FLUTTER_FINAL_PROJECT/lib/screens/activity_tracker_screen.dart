import 'package:flutter/material.dart';
import 'package:fl_chart/fl_chart.dart';

class ActivityTrackerScreen extends StatelessWidget {
  const ActivityTrackerScreen({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Activity Tracker'),
        backgroundColor: Colors.blue,
      ),
      body: Padding(
        padding: const EdgeInsets.all(16.0),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.stretch,
          children: [
            _buildStatCard("Steps Taken", "5,432", Icons.directions_walk, Colors.green),
            const SizedBox(height: 10),
            _buildStatCard("Calories Burned", "234 kcal", Icons.local_fire_department, Colors.orange),
            const SizedBox(height: 10),
            _buildStatCard("Active Minutes", "45 min", Icons.timer, Colors.red),
            const SizedBox(height: 20),
            _buildChart(),
            const SizedBox(height: 20),
            ElevatedButton(
              onPressed: () {},
              child: const Text("Set Daily Goal"),
            ),
          ],
        ),
      ),
    );
  }

  Widget _buildStatCard(String title, String value, IconData icon, Color color) {
    return Card(
      shape: RoundedRectangleBorder(borderRadius: BorderRadius.circular(12)),
      elevation: 5,
      child: Padding(
        padding: const EdgeInsets.all(16.0),
        child: Row(
          mainAxisAlignment: MainAxisAlignment.spaceBetween,
          children: [
            Icon(icon, size: 40, color: color),
            Column(
              crossAxisAlignment: CrossAxisAlignment.end,
              children: [
                Text(title, style: const TextStyle(fontSize: 18, fontWeight: FontWeight.bold)),
                Text(value, style: const TextStyle(fontSize: 22, color: Colors.black87)),
              ],
            )
          ],
        ),
      ),
    );
  }

  Widget _buildChart() {
    return SizedBox(
      height: 200,
      child: BarChart(
        BarChartData(
          alignment: BarChartAlignment.spaceAround,
          barGroups: [
            _makeBarData(0, 4000),
            _makeBarData(1, 5000),
            _makeBarData(2, 6500),
            _makeBarData(3, 7000),
            _makeBarData(4, 8000),
          ],
          titlesData: FlTitlesData(show: false),
          borderData: FlBorderData(show: false),
        ),
      ),
    );
  }

  BarChartGroupData _makeBarData(int x, double y) {
    return BarChartGroupData(x: x, barRods: [BarChartRodData(toY: y, color: Colors.blue, width: 16)]);
  }
}
