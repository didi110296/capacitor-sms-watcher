import Foundation

@objc public class SmsWatcher: NSObject {
    @objc public func echo(_ value: String) -> String {
        print(value)
        return value
    }
}
