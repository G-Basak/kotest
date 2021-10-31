package io.kotest.engine.test.interceptors

import io.kotest.core.test.TestCase
import io.kotest.core.test.TestScope
import io.kotest.core.test.TestResult

actual class TestCoroutineDispatcherInterceptor : TestExecutionInterceptor {
   override suspend fun intercept(
      test: suspend (TestCase, TestScope) -> TestResult
   ): suspend (TestCase, TestScope) -> TestResult = test
}
