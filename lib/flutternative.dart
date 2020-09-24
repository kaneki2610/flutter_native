import 'dart:async';

import 'package:flutter/services.dart';

class Flutternative {
  static const MethodChannel _channel =
      const MethodChannel('flutterNativeVnpt');

  static void get gotoFlutterNative2 async {
    await _channel.invokeMethod('startActivityNative2');
  }
}
