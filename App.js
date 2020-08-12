/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 * @flow strict-local
 */

import React from 'react';
import {
  SafeAreaView,
  StyleSheet,
  ScrollView,
  View,
  Text,
    StatusBar,
    NativeModules,
    Button,
} from 'react-native';

import {
  Header,
  LearnMoreLinks,
  Colors,
  DebugInstructions,
  ReloadInstructions,
} from 'react-native/Libraries/NewAppScreen';

import ToastExample from './ToastExample';
import WheelPickerAndroid from './src/NativeModules/WheelPickerAndroid';
const showRes = async () => {
    const res = await ToastExample.sum(4, 5);
    alert(res);
};
const show = async () => {
    alert(await ToastExample.devide(45, 5));
}
const App = () => {
    return (
        <>
            <View style={styles.container}>
                <WheelPickerAndroid style={styles.wheelPicker} />
            </View>
        </>
    );
};

const styles = StyleSheet.create({
    container: {
        flex: 1,
        width: '100%',
    },
    wheelPicker: {
        width: '100%',
        height: 200,
    },
});

export default App;
